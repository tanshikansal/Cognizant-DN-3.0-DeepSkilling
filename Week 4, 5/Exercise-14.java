@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

}

@Test
public void testGetBookById() throws Exception {
    mockMvc.perform(get("/books/{id}", 1))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.title").value("The Great Gatsby"));
}
