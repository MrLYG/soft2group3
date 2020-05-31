package bcu.lyg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import bcu.lyg.pojo.*;

@RestController
public class LygController {
	
	@RequestMapping(value="/albums")
	public List<Album> findAllAlbum(){
		List<Album> albums=new ArrayList<>();
		for (int i = 0; i < 66; i++) {
			Album a = new Album();
			a.setId(i);
			a.setName("album"+i);
			albums.add(a);
		}
		
		return albums ;
	}
}
