package com.smart;

public class message {
 
	public static String before ="<!DOCTYPE html>\r\n"
			+ "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\r\n"
			+ "\r\n"
			+ "<head>\r\n"
			+ "    <meta charset=\"utf-8\">\r\n"
			+ "    <meta name=\"viewport\" content=\"width=device-width\">\r\n"
			+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> <!-- Use the latest (edge) version of IE rendering engine -->\r\n"
			+ "    <meta name=\"x-apple-disable-message-reformatting\"> <!-- Disable auto-scale in iOS 10 Mail entirely -->\r\n"
			+ "    <title>Welcome - [Plain HTML]</title>\r\n"
			+ "    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:300,500\" rel=\"stylesheet\">\r\n"
			+ "    <link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>\r\n"
			+ "    <script src='https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js'></script>\r\n"
			+ "    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>\r\n"
			+ "    <style>\r\n"
			+ "        html,\r\n"
			+ "        body {\r\n"
			+ "            margin: 0 auto !important;\r\n"
			+ "            padding: 0 !important;\r\n"
			+ "            height: 100% !important;\r\n"
			+ "            width: 100% !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        /* What it does: Stops email clients resizing small text. */\r\n"
			+ "        * {\r\n"
			+ "            -ms-text-size-adjust: 100%;\r\n"
			+ "            -webkit-text-size-adjust: 100%;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        /* What it does: Centers email on Android 4.4 */\r\n"
			+ "        div[style*=\"margin: 16px 0\"] {\r\n"
			+ "            margin: 0 !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        /* What it does: Stops Outlook from adding extra spacing to tables. */\r\n"
			+ "        table,\r\n"
			+ "        td {\r\n"
			+ "            mso-table-lspace: 0pt !important;\r\n"
			+ "            mso-table-rspace: 0pt !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        table {\r\n"
			+ "            border-spacing: 0 !important;\r\n"
			+ "            border-collapse: collapse !important;\r\n"
			+ "            table-layout: fixed !important;\r\n"
			+ "            margin: 0 auto !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        table table table {\r\n"
			+ "            table-layout: auto;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        img {\r\n"
			+ "            -ms-interpolation-mode: bicubic;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        *[x-apple-data-detectors],\r\n"
			+ "        /* iOS */\r\n"
			+ "        .x-gmail-data-detectors,\r\n"
			+ "        /* Gmail */\r\n"
			+ "        .x-gmail-data-detectors *,\r\n"
			+ "        .aBn {\r\n"
			+ "            border-bottom: 0 !important;\r\n"
			+ "            cursor: default !important;\r\n"
			+ "            color: inherit !important;\r\n"
			+ "            text-decoration: none !important;\r\n"
			+ "            font-size: inherit !important;\r\n"
			+ "            font-family: inherit !important;\r\n"
			+ "            font-weight: inherit !important;\r\n"
			+ "            line-height: inherit !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        .a6S {\r\n"
			+ "            display: none !important;\r\n"
			+ "            opacity: 0.01 !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        img.g-img+div {\r\n"
			+ "            display: none !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        /* What it does: Prevents underlining the button text in Windows 10 */\r\n"
			+ "        .button-link {\r\n"
			+ "            text-decoration: none !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        @media only screen and (min-device-width: 375px) and (max-device-width: 413px) {\r\n"
			+ "            .email-container {\r\n"
			+ "                min-width: 375px !important;\r\n"
			+ "            }\r\n"
			+ "        }\r\n"
			+ "    </style>\r\n"
			+ "    <style>\r\n"
			+ "        .button-td,\r\n"
			+ "        .button-a {\r\n"
			+ "            transition: all 100ms ease-in;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        .button-td:hover,\r\n"
			+ "        .button-a:hover {\r\n"
			+ "            background: #555555 !important;\r\n"
			+ "            border-color: #555555 !important;\r\n"
			+ "        }\r\n"
			+ "\r\n"
			+ "        /* Media Queries */\r\n"
			+ "        @media screen and (max-width: 480px) {\r\n"
			+ "            .fluid {\r\n"
			+ "                width: 100% !important;\r\n"
			+ "                max-width: 100% !important;\r\n"
			+ "                height: auto !important;\r\n"
			+ "                margin-left: auto !important;\r\n"
			+ "                margin-right: auto !important;\r\n"
			+ "            }\r\n"
			+ "\r\n"
			+ "            .stack-column,\r\n"
			+ "            .stack-column-center {\r\n"
			+ "                display: block !important;\r\n"
			+ "                width: 100% !important;\r\n"
			+ "                max-width: 100% !important;\r\n"
			+ "                direction: ltr !important;\r\n"
			+ "            }\r\n"
			+ "\r\n"
			+ "            /* And center justify these ones. */\r\n"
			+ "            .stack-column-center {\r\n"
			+ "                text-align: center !important;\r\n"
			+ "            }\r\n"
			+ "\r\n"
			+ "            .center-on-narrow {\r\n"
			+ "                text-align: center !important;\r\n"
			+ "                display: block !important;\r\n"
			+ "                margin-left: auto !important;\r\n"
			+ "                margin-right: auto !important;\r\n"
			+ "                float: none !important;\r\n"
			+ "            }\r\n"
			+ "\r\n"
			+ "            table.center-on-narrow {\r\n"
			+ "                display: inline-block !important;\r\n"
			+ "            }\r\n"
			+ "\r\n"
			+ "            .email-container p {\r\n"
			+ "                font-size: 17px !important;\r\n"
			+ "                line-height: 22px !important;\r\n"
			+ "            }\r\n"
			+ "        }\r\n"
			+ "    </style>\r\n"
			+ "</head>\r\n"
			+ "\r\n"
			+ "<body width=\"100%\" bgcolor=\"#F1F1F1\" style=\"margin: 0; mso-line-height-rule: exactly;\">\r\n"
			+ "    <center style=\"width: 100%; background: #F1F1F1; text-align: left;\">\r\n"
			+ "        <div style=\"font-size:1px;line-height:1px;max-height:0px;max-width:0px;opacity:0;font-family: sans-serif;\"> CryptoContact :";
	public static String middle="</div>\r\n"
			+ "        <div style=\"max-width: 680px; margin: auto;\" class=\"email-container\">\r\n"
			+ "            <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\" width=\"100%\" style=\"max-width: 680px;\" class=\"email-container\">\r\n"
			+ "                <tr>\r\n"
			+ "                    <td bgcolor=\"#333333\">\r\n"
			+ "                        <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td style=\"padding: 30px 40px 30px 40px; text-align: center;\"> <span style=\"color:#fff; font-size: 30px\">CryptoContact</span> </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                        </table>\r\n"
			+ "                    </td>\r\n"
			+ "                </tr>\r\n"
			+ "                <tr>\r\n"
			+ "                    <td background=\"https://res.cloudinary.com/dxfq3iotg/image/upload/v1556165136/switzerland-862870_1920.jpg\" bgcolor=\"#222222\" align=\"center\" valign=\"top\" style=\"text-align: center; background-position: center center !important; background-size: cover !important;\">\r\n"
			+ "                        <div>\r\n"
			+ "                            <table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" width=\"100%\" style=\"max-width:500px; margin: auto;\">\r\n"
			+ "                                <tr>\r\n"
			+ "                                    <td height=\"20\" style=\"font-size:20px; line-height:20px;\">&nbsp;</td>\r\n"
			+ "                                </tr>\r\n"
			+ "                                <tr>\r\n"
			+ "                                    <td align=\"center\" valign=\"middle\">\r\n"
			+ "                                        <table>\r\n"
			+ "                                            <tr>\r\n"
			+ "                                                <td valign=\"top\" style=\"text-align: center; padding: 60px 0 10px 20px;\">\r\n"
			+ "                                                    <h1 style=\"margin: 0; font-family: 'Montserrat', sans-serif; font-size: 30px; line-height: 36px; color: #ffffff; font-weight: bold;\">Hey ";
	public static String mid2=",</h1>\r\n"
			+ "                                                </td>\r\n"
			+ "                                            </tr>\r\n"
			+ "                                            <tr>\r\n"
			+ "                                                <td valign=\"top\" style=\"text-align: center; padding: 10px 20px 15px 20px; font-family: sans-serif; font-size: 15px; line-height: 20px; color: #fff;\">\r\n"
			+ "                                                    <p style=\"margin: 0;\">Access your secured and encrypted data anywhere,anytime!</p>\r\n"
			+ "                                                </td>\r\n"
			+ "                                            </tr>\r\n"
			+ "                                            </table>\r\n"
			+ "                                    </td>\r\n"
			+ "                                </tr>\r\n"
			+ "                                <tr>\r\n"
			+ "                                    <td height=\"20\" style=\"font-size:20px; line-height:20px;\">&nbsp;</td>\r\n"
			+ "                                </tr>\r\n"
			+ "                            </table>\r\n"
			+ "                        </div>\r\n"
			+ "                    </td>\r\n"
			+ "                </tr>\r\n"
			+ "                <tr>\r\n"
			+ "                    <td bgcolor=\"#ffffff\">\r\n"
			+ "                        <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td style=\"padding: 40px 40px 20px 40px; text-align: left;\">\r\n"
			+ "                                    <h1 style=\"margin: 0; font-family: 'Montserrat', sans-serif; font-size: 20px; line-height: 26px; color: #333333; font-weight: bold;\">YOUR ACCOUNT IS SECURED</h1>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td style=\"padding: 0px 40px 20px 40px; font-family: 'Montserrat'; font-size: 22px; line-height: 20px; color: #272525; text-align: left; font-weight:bold;\">\r\n"
			+ "                                    <p style=\"margin: 0;\">";
	public static String end="</p>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td style=\"padding: 0px 40px 20px 40px; font-family: sans-serif; font-size: 15px; line-height: 20px; color: #555555; text-align: left; font-weight:normal;\">\r\n"
			+ "                                    <p style=\"margin: 0;\">We assure you that your data is 100% secured at our end..<br><br> We have the best UI ,so that you feel convinient and much easy to use our product.</p>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                        </table>\r\n"
			+ "                    </td>\r\n"
			+ "                </tr> <!-- INTRO : END -->\r\n"
			+ "                <!-- CTA : BEGIN -->\r\n"
			+ "                <tr>\r\n"
			+ "                    <td bgcolor=\"#26a4d3\">\r\n"
			+ "                        <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td style=\"padding: 40px 40px 5px 40px; text-align: center;\">\r\n"
			+ "                                    <h1 style=\"margin: 0; font-family: 'Montserrat', sans-serif; font-size: 20px; line-height: 24px; color: #ffffff; font-weight: bold;\">YOUR FEEDBACK MOTIVATE US TO MOVE AHEAD</h1>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td style=\"padding: 0px 40px 20px 40px; font-family: sans-serif; font-size: 17px; line-height: 23px; color: #aad4ea; text-align: center; font-weight:normal;\">\r\n"
			+ "                                    <p style=\"margin: 0;\">Let us know what you think of our product</p>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td valign=\"middle\" align=\"center\" style=\"text-align: center; padding: 0px 20px 40px 20px;\">\r\n"
			+ "                                    <!-- Button : BEGIN -->\r\n"
			+ "                                    <table role=\"presentation\" align=\"center\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" class=\"center-on-narrow\">\r\n"
			+ "                                        <tr>\r\n"
			+ "                                            <td style=\"border-radius: 50px; background: #ffffff; text-align: center;\" class=\"button-td\"> <a href=\"mailto:tdkdevelopment14@gmail.com\" style=\"background: #ffffff; border: 15px solid #ffffff; font-family: 'Montserrat', sans-serif; font-size: 14px; line-height: 1.1; text-align: center; text-decoration: none; display: block; border-radius: 50px; font-weight: bold;\" class=\"button-a\"> <span style=\"color:#26a4d3;\" class=\"button-link\">&nbsp;&nbsp;&nbsp;&nbsp;GIVE FEEDBACK&nbsp;&nbsp;&nbsp;&nbsp;</span> </a> </td>\r\n"
			+ "                                        </tr>\r\n"
			+ "                                    </table>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                        </table>\r\n"
			+ "                    </td>\r\n"
			+ "                </tr>\r\n"
			+ "                <tr>\r\n"
			+ "                    <td bgcolor=\"#ffffff\">\r\n"
			+ "                        <table role=\"presentation\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\"> <br>\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td align=\"center\"> <img src=\"https://img.icons8.com/dusk/64/000000/ms-share-point.png\" width=\"37\" height=\"37\" style=\"display: block; border: 0px;\" /> </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td align=\"center\" style=\"font-family: Open Sans, Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 400; line-height: 24px; padding: 5px 0 10px 0;\">\r\n"
			+ "                                    <p style=\"font-size: 14px; font-weight: 800; line-height: 18px; color: #333333;\"> CryptoContact.com<br> Bhubaneswar,India </p>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td style=\"padding: 0px 40px 10px 40px; font-family: sans-serif; font-size: 12px; line-height: 18px; color: #666666; text-align: center; font-weight:normal;\">\r\n"
			+ "                                    <p style=\"margin: 0;\">This email was sent to you from tdkdevelopment14@gmail.com</p>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                            <tr>\r\n"
			+ "                                <td style=\"padding: 0px 40px 40px 40px; font-family: sans-serif; font-size: 12px; line-height: 18px; color: #666666; text-align: center; font-weight:normal;\">\r\n"
			+ "                                    <p style=\"margin: 0;\">Copyright &copy; 2018-2019 <b>CryptoContact.com</b>, All Rights Reserved.</p>\r\n"
			+ "                                </td>\r\n"
			+ "                            </tr>\r\n"
			+ "                        </table>\r\n"
			+ "                    </td>\r\n"
			+ "                </tr>\r\n"
			+ "            </table>\r\n"
			+ "        </div>\r\n"
			+ "    </center>\r\n"
			+ "</body>\r\n"
			+ "\r\n"
			+ "</html>";
}