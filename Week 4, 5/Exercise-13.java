@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
public class BookControllerTest {

    @Autowired
    private MockMvc mockMvc;

}

@Test
public void testGetBookById() throws Exception {
    when(bookService.getBookById(1L)).thenReturn(new Book(1L, "The Great Gatsby"));

    mockMvc.perform(get("/books/1"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.title").value("The Great Gatsby"));
}
