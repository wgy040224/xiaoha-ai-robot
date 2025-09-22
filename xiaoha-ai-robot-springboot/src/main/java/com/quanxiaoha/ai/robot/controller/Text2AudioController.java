package com.quanxiaoha.ai.robot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.openai.audio.speech.Speech;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@RestController
@RequestMapping("/v11/ai")
@Slf4j
public class Text2AudioController {

    @Value("${spring.ai.openai.api-key}")
    private String apiKey;

    /**
     * 调用阿里百炼-语音合成大模型
     * @param prompt
     * @return
     */
    @GetMapping("/text2audio")
    public String text2audio(@RequestParam(value = "prompts") String prompt) {
        // 构建语音合成相关参数
//        SpeechSynthesisParam param = SpeechSynthesisParam.builder()
//                        .apiKey(apiKey) // 阿里百炼 API Key
//                        .model("cosyvoice-v2") // 模型名称
//                        .voice("longanran") // 音色
//                        .build();
//
//        // 同步调用语音合成大模型，并获字节流
//        SpeechSynthesizer synthesizer = new SpeechSynthesizer(param, null);
//        ByteBuffer audio = synthesizer.call(prompt);
//
//        // 音频文件存储路径
//        String path = "E:\\result-audio.mp3";
//        File file = new File(path);
//
//        log.info("## requestId: {}", synthesizer.getLastRequestId());
//
//        // 存储字节流
//        try (FileOutputStream fos = new FileOutputStream(file)) {
//            fos.write(audio.array());
//        } catch (IOException e) {
//            log.error("", e);
//        }

        return "success";
    }

}