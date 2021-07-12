package kr.nutee.crawler.Controller;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


public class NoticeControllerTest extends BaseControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test @Order(1)
    public void crawlHaksa() throws Exception {

        String pageNo = "5";
//        PageNumber body = PageNumber.builder()
//                .pageNo(pageNo)
//                .build();

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/crawl/haksa")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaTypes.HAL_JSON_VALUE)
                .header("Access-Control-Request-Method","GET")
                .header("Origin", "http://nutee.kr:9709/crawl")
                .param("page", "5");
//                .content(objectMapper.writeValueAsString(body));

        mockMvc.perform(builder)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaTypes.HAL_JSON_VALUE + ";charset=UTF-8"))
                .andExpect(jsonPath("code").exists())
                .andExpect(jsonPath("message").exists())
                .andExpect(jsonPath("body",4).exists())
                .andExpect(jsonPath("_links.self").exists())
                .andDo(document("get-haksa"));
    }

    @Test @Order(2)
    public void crawlSooup() throws Exception {

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/crawl/sooup")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaTypes.HAL_JSON_VALUE)
                .header("Access-Control-Request-Method","GET")
                .header("Origin", "http://hello");

        mockMvc.perform(builder)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaTypes.HAL_JSON_VALUE + ";charset=UTF-8"))
                .andExpect(jsonPath("code").exists())
                .andExpect(jsonPath("message").exists())
                .andExpect(jsonPath("body",4).exists())
                .andExpect(jsonPath("_links.self").exists())
                .andDo(document("get-sooup"));
    }

    @Test @Order(3)
    public void crawlHakjum() throws Exception {

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/crawl/hakjum")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaTypes.HAL_JSON_VALUE)
                .header("Access-Control-Request-Method","GET")
                .header("Origin", "http://hello");

        mockMvc.perform(builder)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaTypes.HAL_JSON_VALUE + ";charset=UTF-8"))
                .andExpect(jsonPath("code").exists())
                .andExpect(jsonPath("message").exists())
                .andExpect(jsonPath("body",4).exists())
                .andExpect(jsonPath("_links.self").exists())
                .andDo(document("get-hakjum"));
    }

    @Test @Order(4)
    public void crawlJanghak() throws Exception {

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/crawl/janghak")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaTypes.HAL_JSON_VALUE)
                .header("Access-Control-Request-Method","GET")
                .header("Origin", "http://hello");

        mockMvc.perform(builder)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaTypes.HAL_JSON_VALUE + ";charset=UTF-8"))
                .andExpect(jsonPath("code").exists())
                .andExpect(jsonPath("message").exists())
                .andExpect(jsonPath("body",4).exists())
                .andExpect(jsonPath("_links.self").exists())
                .andDo(document("get-janghak"));
    }

    @Test @Order(5)
    public void crawlIlban() throws Exception {

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/crawl/ilban")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaTypes.HAL_JSON_VALUE)
                .header("Access-Control-Request-Method","GET")
                .header("Origin", "http://hello");

        mockMvc.perform(builder)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaTypes.HAL_JSON_VALUE + ";charset=UTF-8"))
                .andExpect(jsonPath("code").exists())
                .andExpect(jsonPath("message").exists())
                .andExpect(jsonPath("body",4).exists())
                .andExpect(jsonPath("_links.self").exists())
                .andDo(document("get-ilban"));
    }

    @Test @Order(6)
    public void crawlHangsa() throws Exception {

        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/crawl/hangsa")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaTypes.HAL_JSON_VALUE)
                .header("Access-Control-Request-Method","GET")
                .header("Origin", "http://hello");

        mockMvc.perform(builder)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(header().string(HttpHeaders.CONTENT_TYPE, MediaTypes.HAL_JSON_VALUE + ";charset=UTF-8"))
                .andExpect(jsonPath("code").exists())
                .andExpect(jsonPath("message").exists())
                .andExpect(jsonPath("body",4).exists())
                .andExpect(jsonPath("_links.self").exists())
                .andDo(document("get-hangsa"));
    }


}