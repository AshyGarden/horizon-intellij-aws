package com.spring.jpa.api.boardapi.api;

import com.spring.jpa.api.boardapi.entity.ItemVO;
import com.spring.jpa.api.boardapi.service.BoardService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/news")
public class BoardController {

    private String url = "http://apis.data.go.kr/B090041/openapi/service/AstroEventInfoService/getAstroEventInfo?solYear=2023&solMonth=06&numOfRows=50&ServiceKey=Oj6H3KnLe3AEzEuUfiAQbNV%2F2VRcDwTieuyWDRBFBDAwApr4%2FxXZTyiTPWkgUhIIo%2FiSVYyqSXvb1pdIqf2atg%3D%3D";
    
    //private final BoardServ
    //ice boardService;
    @RequestMapping("/news1")
    @ResponseBody
    public Map<String, Object> CreateBoard( ){
        System.out.println("board");

        Map<String, Object> map = new HashMap<String, Object>();
        //프론트에서 호출할 함수
        try {
            URL url = new URL("http://apis.data.go.kr/B090041/openapi/service/AstroEventInfoService/getAstroEventInfo?solYear=2023&solMonth=06&numOfRows=50&ServiceKey=Oj6H3KnLe3AEzEuUfiAQbNV%2F2VRcDwTieuyWDRBFBDAwApr4%2FxXZTyiTPWkgUhIIo%2FiSVYyqSXvb1pdIqf2atg%3D%3D");
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(url.openStream());
            Element root = doc.getRootElement();

            System.out.println(root.getName());

            Element body = root.getChild("body");
            Element items = body.getChild("items");
            List<Element> list = items.getChildren("item");
            List<ItemVO> itemList = new ArrayList<>();
            for(Element item : list){
                ItemVO vo = new ItemVO();
                vo.setAstroEvent(item.getChildText("astroEvent"));
                vo.setLocdate(item.getChildText("locdate"));
                vo.setAstroTime(item.getChildText("astroTime"));

                itemList.add(vo);
            }

            map.put("list",itemList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


}
