package com.ads.pwb.sistemaProgramacaoWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


    @Autowired
    private JavaMailSender javaMailSender;

    @Value("{$spring.mail.username}")
    private String remetente;

    public String enviarEmailCadastro(String destinatario, String assunto, String mensagem){

        try{
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom(remetente);
            simpleMailMessage.setTo(destinatario);
            simpleMailMessage.setSubject(assunto);
            simpleMailMessage.setText(mensagem);
            System.out.println("enviado");
            javaMailSender.send(simpleMailMessage);
            return "Email enviado";
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
            return "Erro ao enviar o email" + e.getLocalizedMessage();
        }
    }
}
