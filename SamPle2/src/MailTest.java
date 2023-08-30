import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class MailTest
{
	String t1 = "",t2 ="",str="",t3="";
	
	MailTest(String t1, String t2, String str, String t3)
	{
		Properties p = System.getProperties();
        p.put("mail.smtp.starttls.enable", "true");     // gmail은 true 고정
        p.put("mail.smtp.host", "smtp.naver.com");      // smtp 서버 주소
        p.put("mail.smtp.auth","true");                 // gmail은 true 고정
        p.put("mail.smtp.port", "587");                 // 네이버 포트
        p.put("mail.smtp.port", "587");                 // 네이버 포트
        p.put("mail.smtp.ssl.trust", "smtp.naver.com");
        p.put("mail.smtp.ssl.protocols", "TLSv1.2");
           
        Authenticator auth = new MyAuthentication();
        //session 생성 및  MimeMessage생성
        Session session = Session.getDefaultInstance(p, auth);
        MimeMessage msg = new MimeMessage(session);
         
        try{
            //편지보낸시간
            msg.setSentDate(new Date());
            InternetAddress from = new InternetAddress() ;
            from = new InternetAddress("easycross@naver.com"); //발신자 아이디
            // 이메일 발신자
            msg.setFrom(from);
            // 이메일 수신자
            InternetAddress to = new InternetAddress("easycross@naver.com");
            msg.setRecipient(Message.RecipientType.TO, to);
            // 이메일 제목
            msg.setSubject("(신고) ["+ (t1) +"]이 ["+(t2)+"]를 신고", "UTF-8");
            // 이메일 내용
            msg.setText(str+"회신:"+t3+"으로", "UTF-8");
            // 이메일 헤더
            msg.setHeader("content-Type", "text/html");
            //메일보내기
            javax.mail.Transport.send(msg, msg.getAllRecipients());
             
        }
        catch (AddressException addr_e) 
        {
            addr_e.printStackTrace();
        }
        catch (MessagingException msg_e) 
        {
            msg_e.printStackTrace();
        }
        catch (Exception msg_e) 
        {
            msg_e.printStackTrace();
        }
	}
}	

class MyAuthentication extends Authenticator 
{
      
    PasswordAuthentication pa;
    public MyAuthentication()
    {
         
        String id = "easycross@naver.com";  //네이버 이메일 아이디
        String pw = "little@0770";        //네이버 비밀번호
 
        // ID와 비밀번호를 입력한다.
        pa = new PasswordAuthentication(id, pw);
    }
 
    // 시스템에서 사용하는 인증정보
    public PasswordAuthentication getPasswordAuthentication() 
    {
        return pa;
    }
} 
  
