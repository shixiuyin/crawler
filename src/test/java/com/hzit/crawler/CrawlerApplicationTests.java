package com.hzit.crawler;

import com.hzit.crawler.service.ApiServlce;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrawlerApplicationTests {

	@Autowired
	private ApiServlce apiServlce;

	@Test
	public void testGetHtml() throws Exception {
		String html = this.apiServlce.getHtml("https://www.autohome.com.cn/bestauto/");
		Document document = Jsoup.parse(html);
		String title = document.select("title").first().text();
		System.out.println(title);
	}

	@Test
	public void testGetImage() throws Exception {
		String image = this.apiServlce.getImage(
				"http://videohy.tc.qq.com/vcloud1049.tc.qq.com/1049_M0114600004f9fQC2zVwGr1001595494.f40.mp4?vkey=9F48E935106F9916733FA63B0D8B1391C2FE539183E028BAB90867FAE1B0E136F235B9E63125CBEC66BFC0E20491702643417535CBEA9DB24AFA39A262021E8B9C0BEF90526835B4119EEAEB86A0C021D0CBDFB2417EA12B&ocid=273421740");
		System.out.println(image);
	}

}
