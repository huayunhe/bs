package com.example.bs.service.impl;

import com.example.bs.service.IdentifyFloaterService;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.PumpStreamHandler;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class IdentifyFloaterServiceImpl implements IdentifyFloaterService {
    @Override
    public String identifyFloater(){
        String command = "python"
                + " G:/毕设/水面漂浮物/3/Self-Supervise-Object-Detection-main/demo/video_demo.py"
                + " G:/Flow/video/1_check/Sequence_2.mp4"
                + " G:/毕设/水面漂浮物/3/Self-Supervise-Object-Detection-main/mmdetection/yolox_flow.py"
                + " G:/毕设/水面漂浮物/3/Self-Supervise-Object-Detection-main/flow_out/best_bbox_mAP_epoch_300.pth"
                + " --out"+ " G:/Flow/video/1_check/" + "result.mp4";
        CommandLine cmdLine = CommandLine.parse(command);
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            DefaultExecutor executor = new DefaultExecutor();
            PumpStreamHandler streamHandler = new PumpStreamHandler(baos);

            //Process process = Runtime.getRuntime().exec(command);
            executor.setStreamHandler(streamHandler);
            int exitCode = executor.execute(cmdLine);
            if(exitCode==0){
                System.out.println("执行成功");
            }else{
                System.out.println("执行失败");
            }
            System.out.println(baos.toString().trim());
            return "执行完毕";
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("执行python脚本出错");
            return "执行python脚本失败";
        }


    }

}
