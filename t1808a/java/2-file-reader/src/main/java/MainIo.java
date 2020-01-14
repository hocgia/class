import entity.Video;
import entity.VideoStatic;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MainIo {
    public static void main(String[] args) throws IOException {

        ArrayList<Video> videos = new ArrayList<Video>();
        FileReader fileReader = new FileReader("src/main/resources/tj.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            if (count == 0) {
                count++;
                continue;
            }
            count++;
//            System.out.println(line);
            String[] strings = line.split("\\s{2,}");
            if (strings.length == 4) {
                String day = strings[0];
                String id = strings[1];
                String title = strings[2];
                String view = strings[3];
                int viewInt = Integer.parseInt(view);
                Video video = new Video(day, id, title, viewInt);
                videos.add(video);
            }
        }
        HashMap<String, VideoStatic> videoStaticHashMap = new HashMap<String, VideoStatic>();
        for (Video video : videos) {
            int viewStatic = 0;
            if (videoStaticHashMap.containsKey(video.getId())) {
                VideoStatic videoStatic = videoStaticHashMap.get(video.getId());
                viewStatic = videoStatic.getViewStatic();
            }
            viewStatic += video.getView();
            VideoStatic videoStatic = new VideoStatic(video.getId(), video.getTitle(), viewStatic);
            videoStaticHashMap.put(video.getId(), videoStatic);
        }

        for (String id : videoStaticHashMap.keySet()) {
            VideoStatic videoStatic = videoStaticHashMap.get(id);
            System.out.println("Id: " + id);
            System.out.println("Title:" + videoStatic.getName());
            System.out.println("View Static: " + videoStatic.getViewStatic());
            System.out.println("------------------------------");
        }


    }
}



