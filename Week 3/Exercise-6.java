Pageable firstPageWithTwoElements = PageRequest.of(0, 2);
Pageable secondPageWithFiveElements = PageRequest.of(1, 5);

Page<Product> allProducts = productRepository.findAll(firstPageWithTwoElements);
List<Product> allTenDollarProducts = productRepository.findAllByPrice(10, secondPageWithFiveElements);

List<Product> findAllByNameOrderByPriceAsc(String name);

Pageable pageable = PageRequest.of(0, 10, Sort.by("price").ascending());
Page<Product> paginatedAndSortedProducts = productRepository.findAll(pageable);

