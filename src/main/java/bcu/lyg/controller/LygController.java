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
		
		
		
		String[] name = new String[]{"蒲提-爱我 (男生版)","许嵩-半城烟沙","孙楠-不灭的心","许嵩-城府","MC隐修-音乐的代价","许嵩-断桥残雪","徐良,阿悄-犯贱","孙楠-风往北吹","Angel Girl-花木兰","许嵩-幻听","李涛-活埋","任然-离眸","蔡琴,余天,苏芮,潘越云-明天会更好","沈庆-青春","彭羚-囚鸟","许嵩-如果当时","许嵩-山水之间","郑钧-私奔","BWO-Sunshine In The Rain","许嵩-叹服","温岚,周杰伦-屋顶","儿歌-小草","欢子-心痛2009","许嵩-医生","许嵩-雨幕","ai mini-遇","张杰-着魔","孙楠,那英-只要有你","田震-执着 (原版)","张玮-追爱","孙悦-祝你平安"};
		String[] Images = new String[]{"http://118.25.250.106/picture/aiwopic.jpg","http://118.25.250.106/picture/banchengyanshapic.jpg","http://118.25.250.106/picture/bumiedexinpic.jpg","http://118.25.250.106/picture/chengfupic.jpg","http://118.25.250.106/picture/daijiapic.jpg","http://118.25.250.106/picture/duanqiaocanxuepic.jpg","http://118.25.250.106/picture/fanjianpic.jpg","http://118.25.250.106/picture/fengwangbeichuipic.jpg","http://118.25.250.106/picture/huamulanpic.jpg","http://118.25.250.106/picture/huantingpic.jpg","http://118.25.250.106/picture/huomaipic.jpg","http://118.25.250.106/picture/limoupic.jpg","http://118.25.250.106/picture/mingtianpic.jpg","http://118.25.250.106/picture/qingchunpic.jpg","http://118.25.250.106/picture/qiuniaopic.jpg","http://118.25.250.106/picture/ruguodangshipic.jpg","http://118.25.250.106/picture/shanshuizhijianpic.jpg","http://118.25.250.106/picture/sunshinepic.jpg","http://118.25.250.106/picture/tanfupic.jpg","http://118.25.250.106/picture/wudingpic.jpg","http://118.25.250.106/picture/xiaocaopic.jpg","http://118.25.250.106/picture/xintongpic.jpg","http://118.25.250.106/picture/yishengpic.jpg","http://118.25.250.106/picture/yumupic.jpg","http://118.25.250.106/picture/yupic.jpg","","http://118.25.250.106/picture/zhaomopic.jpg","http://118.25.250.106/picture/zhiyaoyounipic.jpg","http://118.25.250.106/picture/zhizhuopic.jpg","http://118.25.250.106/picture/zhuiaipic.jpg","http://118.25.250.106/picture/zhunipinganpic.jpg"};
		String[] Audios = new String[]{"http://118.25.250.106/musics/aiwo.mp3","http://118.25.250.106/musics/banchengyansha.mp3","http://118.25.250.106/musics/bumiedexin.mp3","http://118.25.250.106/musics/chengfu.mp3","http://118.25.250.106/musics/daijia.mp3","http://118.25.250.106/musics/duanqiaocanxue.mp3","http://118.25.250.106/musics/fanjian.mp3","http://118.25.250.106/musics/fengwangbeichui.mp3","http://118.25.250.106/musics/huamulan.mp3","http://118.25.250.106/musics/huanting.mp3","http://118.25.250.106/musics/huomai.mp3","http://118.25.250.106/musics/limou.mp3","http://118.25.250.106/musics/mingtian.mp3","http://118.25.250.106/musics/qingchun.mp3","http://118.25.250.106/musics/qiuniao.mp3","http://118.25.250.106/musics/ruguodangshi.mp3","http://118.25.250.106/musics/shanshuizhijian.mp3","http://118.25.250.106/musics/siben.mp3","http://118.25.250.106/musics/sunshine.mp3","http://118.25.250.106/musics/tanfu.mp3","http://118.25.250.106/musics/wuding.mp3","http://118.25.250.106/musics/xiaocao.mp3","http://118.25.250.106/musics/xintong.mp3","http://118.25.250.106/musics/yisheng.mp3","http://118.25.250.106/musics/yumu.mp3","http://118.25.250.106/musics/yu.mp3","http://118.25.250.106/musics/zhaomo.mp3","http://118.25.250.106/musics/zhiyaoyouni.mp3","http://118.25.250.106/musics/zhizhuo.mp3","http://118.25.250.106/musics/zhuiai.mp3","http://118.25.250.106/musics/zhunipingan.mp3"};
		
		for (int i = 0; i < name.length; i++) {
			Album a = new Album();
			a.setId(i);
			a.setName(name[i]);
			a.setImagePath(Images[i]);
			a.setAudioPath(Audios[i]);
			albums.add(a);
		}
		
		return albums ;
	}
}
