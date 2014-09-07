<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html class="no-js" data-version="v1.19.0e5adbb3bced98b6ce7da6d7573c979e10ffc07d" data-language="en_US" lang="en">
   <head>
      <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
      <meta charset="UTF-8" />
      <title>Expedia PartnerCentral Prototype</title>
      <meta name="robots" content="nofollow" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <link rel="shortcut icon" type="image/x-icon" href="http://ewe-assets.s3.amazonaws.com/uitoolkit/1-19/0e5adbb3bced98b6ce7da6d7573c979e10ffc07d/core/images/favicon.ico" sizes="16x16 32x32" />
      <link rel="icon" type="image/x-icon" href="http://ewe-assets.s3.amazonaws.com/uitoolkit/1-19/0e5adbb3bced98b6ce7da6d7573c979e10ffc07d/core/images/favicon.ico"  sizes="16x16 32x32" />
      <script src="http://ewe-assets.s3.amazonaws.com/uitoolkit/1-19/0e5adbb3bced98b6ce7da6d7573c979e10ffc07d/core/js/uitk-lib-bundle-min.js"></script>
      <script src="http://code.jquery.com/jquery-latest.min.js"type="text/javascript"></script>
      <!--[if lt IE 8]>
      <script src="http://ewe-assets.s3.amazonaws.com/uitoolkit/1-19/0e5adbb3bced98b6ce7da6d7573c979e10ffc07d/core/js/uitk-ltie8-bundle-min.js"></script>
      <![endif]-->
      <link rel='stylesheet' type='text/css' href='http://ewe-assets.s3.amazonaws.com/uitoolkit/1-19/0e5adbb3bced98b6ce7da6d7573c979e10ffc07d/core/minifiedCss/core.css'/>
      <link rel='stylesheet' type='text/css' href='http://a.travel-assets.com/uitoolkit/2-11/cf3d80d31de5d66ec525abc70739894b0b38788e/core/minifiedCss/core-responsive.css'/>
      <!--[if lt IE 8]>
      <link rel='stylesheet' type='text/css' href='http://ewe-assets.s3.amazonaws.com/uitoolkit/1-19/0e5adbb3bced98b6ce7da6d7573c979e10ffc07d/core/minifiedCss/ie7.css'/>
      <![endif]-->
      <link rel='stylesheet' type='text/css' href='http://www.exuxtravel.com/EPC/eqc/assets/css/prototype.css'/>
      <script type="text/javascript">
         $LAB.setGlobalDefaults({AlwaysPreserveOrder:true});
         $LAB.queueScript("http://ewe-assets.s3.amazonaws.com/uitoolkit/1-19/0e5adbb3bced98b6ce7da6d7573c979e10ffc07d/core/js/uitk-jquery-jstemplate-bundle-min.js")
         $LAB.queueScript("http://ewe-assets.s3.amazonaws.com/uitoolkit/1-19/0e5adbb3bced98b6ce7da6d7573c979e10ffc07d/core/js/uitk-core-bundle-min.js")
         $LAB
           .queueScript("http://www.exuxtravel.com/EPC/eqc/assets/js/prototype.js")
           .queueWait(function(){
           uitk.init();
           uitk.initSocial();
         });
      </script>      
   </head>
   <body class="wrap cf layout-2col-a off-canvas" data-vtest-area="two_column_a_template">



<nav id="slide-menu">
<!-- 

    Left menu

-->
   <ul>
      <li class="current-parent-link"> 
         <a href="/content/home">Connectivity Solutions Home</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/connectivity">About Connectivity</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/eqc-home">Expedia QuickConnect®</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-system-providers">System Providers</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-preferred-program">EQC Preferred Program</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-how-it-works">How Does It Work</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-get-started">How to Get Started</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-best-practices">Best Practices</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-faq">FAQ</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-contact">Contact Us</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/hotwire-quickconnect-home">Hotwire QuickConnect</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-system-providers">System Providers</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-what">What can it do for me?</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-how-to-start">How to get started</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-general-faq">FAQ</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-contact-us">Contact Us</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/vc-home">VenereConnect™</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/termsandconditions">Connectivity Terms and Conditions</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/expedia">About Expedia</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/contact">Contact Us</a>
      </li>
      <li class="parent-link">
         <a href="/login">Developer Area</a>
      </li>
   </ul>

</nav>


      <div id="content">
         <div id="content_inner">
            <header role="banner" class="site-header">
               <div class="cols-row">
                  <div class="icon icon-offcanvas menu-trigger" aria-hidden="true"></div>
                  <img src="http://www.exuxtravel.com/EPC/eqc/assets/img/logo.png" />
                  
<div class="top-lang-select-box">
                <div class="top-select">
                <input type="hidden" id="lang_hidden" value="2057">
                    <div id="lang_select" class="select-box-dropdown ">
                        <div id="signIn_lang_select">
                        <span id="select_box_label" class="select-box-label">English UK</span>
                        <span class="select-box-arrow"></span>
                        <ul id="lang_list" class="select-box-dropdown-menu foot-select-box-options">
                                <li>
                                    <a langid="1033" langlocalecode="en-US">English US</a>
                                </li>
                                <li class="select-box-selected">
                                    <a langid="2057" langlocalecode="en-GB">English UK</a>
                                </li>
                                <li>
                                    <a langid="3082" langlocalecode="es-ES">Español</a>
                                </li>
                                <li>
                                    <a langid="1040" langlocalecode="it-IT">Italiano</a>
                                </li>
                                <li>
                                    <a langid="1036" langlocalecode="fr-FR">Français</a>
                                </li>
                                <li>
                                    <a langid="1031" langlocalecode="de-DE">Deutsch</a>
                                </li>
                                <li>
                                    <a langid="1041" langlocalecode="ja-JP">???</a>
                                </li>
                                <li>
                                    <a langid="2052" langlocalecode="zh-CN">??</a>
                                </li>
                                <li>
                                    <a langid="1028" langlocalecode="zh-TW">?? (??)</a>
                                </li>
                                <li>
                                    <a langid="1043" langlocalecode="nl-NL">Nederlands</a>
                                </li>
                                <li>
                                    <a langid="1053" langlocalecode="sv-SE">Svenska</a>
                                </li>
                                <li>
                                    <a langid="1044" langlocalecode="nb-NO">norsk, bokmål (Norge)</a>
                                </li>
                                <li>
                                    <a langid="1055" langlocalecode="tr-TR">Türkçe</a>
                                </li>
                                <li>
                                    <a langid="2070" langlocalecode="pt-PT">Portuguese (Portugal)</a>
                                </li>
                                <li>
                                    <a langid="1046" langlocalecode="pt-BR">Portuguese (Brazilian)</a>
                                </li>
                                <li>
                                    <a langid="1030" langlocalecode="da-DK">Dansk</a>
                                </li>
                                <li>
                                    <a langid="1042" langlocalecode="ko-KR">???</a>
                                </li>
                                <li>
                                    <a langid="1045" langlocalecode="pl-PL">polski</a>
                                </li>
                                <li>
                                    <a langid="1032" langlocalecode="el-GR">????????</a>
                                </li>
                                <li>
                                    <a langid="1049" langlocalecode="ru-RU">???????</a>
                                </li>
                                <li>
                                    <a langid="1066" langlocalecode="vi-VN">Tiê´ng Viê?t</a>
                                </li>
                                <li>
                                    <a langid="1029" langlocalecode="cs-CZ">Ceština</a>
                                </li>
                                <li>
                                    <a langid="1054" langlocalecode="th-TH">???????</a>
                                </li>
                                <li>
                                    <a langid="1038" langlocalecode="hu-HU">magyar</a>
                                </li>
                                <li>
                                    <a langid="1035" langlocalecode="fi-FI">suomi</a>
                                </li>
                                <li>
                                    <a langid="1050" langlocalecode="hr-HR">hrvatski</a>
                                </li>
                        </ul>
                    </div>
                </div>
                </div>
            </div>                  
                  
               </div>
                
            </header>
            <div class="site-content-wrap">
               <div class="site-content cols-row cf" role="region">
               	
               	
                                
				
				<header id="completePageHeader" class="cols-row-header cf">
				<hgroup class="page-header">
				<h1 class="section-header-main">Expedia QuickConnect&reg; &amp; Hotwire QuickConnect</h1>
				</hgroup>
				</header>					

                  
                  <aside class="col margin-set" role="complementary">
                  	

   <ul>
      <li class="current-parent-link"> 
         <a href="/content/home">Connectivity Solutions Home</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/connectivity">About Connectivity</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/eqc-home">Expedia QuickConnect &reg;</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-system-providers">System Providers</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-preferred-program">EQC Preferred Program</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-how-it-works">How Does It Work</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-get-started">How to Get Started</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-best-practices">Best Practices</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-faq">FAQ</a>
      </li>
      <li class="child-link"> 
         <a href="/content/eqc-contact">Contact Us</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/hotwire-quickconnect-home">Hotwire QuickConnect</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-system-providers">System Providers</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-what">What can it do for me?</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-how-to-start">How to get started</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-general-faq">FAQ</a>
      </li>
      <li class="child-link"> 
         <a href="/content/hotwire-contact-us">Contact Us</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/vc-home">VenereConnect &reg;</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/termsandconditions">Connectivity Terms and Conditions</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/expedia">About Expedia</a>
      </li>
      <li class="parent-link"> 
         <a href="/content/contact">Contact Us</a>
      </li>
      <li class="parent-link">
         <a href="/login">Developer Area</a>
      </li>
   </ul>


                  </aside>
                  <section class="col margin-set" id="main-content" role="main">
  
               	

   <p>
      Expedia's lodging connectivity solutions offer hotel partners the opportunity to link directly to Expedia - all with the goal of making it easier to connect to Expedia's global marketplace.
   </p>
   <p>
      Expedia has several connectivity solutions available to our hotel partners and their system providers.
   </p>
   <p>
      Get yourself connected!
   </p>
   <hr>
   <h2>
      News
   </h2>
   <p>
      16th Jul 2014 - <strong>New EQC API Specification (v1.5) is now available</strong> -&nbsp;<a href="http://www.expediaquickconnect.com/content/eqc-developer-area"><span class="m-info">More info</span></a>
   </p>
   <p>
      21st Mar 2014 - <strong>New EQC API Specification (v1.4) is now available</strong> - <a href="http://www.expediaquickconnect.com/content/eqc-developer-area"><span class="m-info">More info</span></a>
   </p>
   <p>
      13th Jan 2014&nbsp;- <strong>New EQC API Specification (v1.3)&nbsp;is now available</strong>  -&nbsp;<a href="http://www.expediaquickconnect.com/forum_posts/2343"><span class="m-info">More info</span></a>
   </p>
   <p>
      31th Oct 2013&nbsp;- <strong>Inventory Sold is now available in PARR Responses</strong>  -&nbsp;<a href="http://www.expediaquickconnect.com/content/eqc-downloads/"><span class="m-info">More info</span></a>
   </p>
   <p>
      28th Aug 2013&nbsp;- <strong>New EQC API Specification is now available</strong>  -&nbsp;<a href="http://www.expediaquickconnect.com/content/eqc-downloads/"><span class="m-info">More info</span></a>
   </p>
   <p>
      28th Aug 2012 - <strong>Starting November 2012, Venere Connect (VC) will migrate to Expedia Quick Connect (EQC)</strong>-&nbsp; <a href="http://www.expediaquickconnect.com/content/vc-home"><span class="m-info">More info</span></a>
   </p>
   <p>
      9th Apr 2012 - <strong>Launch of Expedia Connect 2</strong> - To read the full press release <a href="http://press.expediainc.com/index.php?s=43&amp;item=478">click here</a>. If you need more information or have any questions please reach out to <a href="mailto:connect@expedia.com">connect@expedia.com</a>
   </p>
   <hr>
   <h2>
      Hotel Partners
   </h2>
   <p>
      Learn more about how Expedia QuickConnect&reg; can facilitate your revenue management strategy by quickly and simply automating the process of working with Expedia Inc.
   </p>
   <p>
      About Connectivity: <a href="/content/connectivity/"><span class="m-info">More info</span></a>
   </p>
   <hr>
   <h2>
      Developers / Hotel Systems Providers
   </h2>
   <p>
      Everything you need to deliver simple connectivity solutions for your customers combining the best of web 2.0 and XML; fast to develop and easy to deploy.
   </p>
   <div class="dev-area-buttons">
      <p>More info:</p>
      <p>
         <a href="/login?site_id=2"><img alt="Logo_eqc_button" class="eqc-dev-image-button" src="http://www.exuxtravel.com/EPC/eqc/assets/img/logo_eqc_button.gif"></a>
      </p>
      <p>
         <a href="/login?site_id=3"><img alt="Logo_venereconnect_button" class="vc-dev-image-button" src="http://www.exuxtravel.com/EPC/eqc/assets/img/logo_venereconnect_button.gif"></a>
      </p>
   </div>                  	
                 
                  
                 
                  </section>
               </div>
            </div>
            <div class="site-footer-background">
               <div class="site-footer-wrap cols-nested">
                  <footer role="contentinfo ">
<div class="epc-footer">
<div class="footer-content row">

<div class="footer-bar col-xs-10 col-sm-10">
                <a target="_blank" href="http://www.askexpedia.com" metric-label="Navigation Footer" metric-action="ContactExpedia" metric-category="Link Click Through Rate" metric="true" id="f_contact_expedia" class="epc-foot-item-link">Contact Expedia</a>
                <a class="epc-foot-item-link" href="https://www.expediapartnercentral.com/TermsOfUse" id="f_terms_of_use">Terms of Use</a>
            </div>	
	
         <div id="footer_logo" class="footer-logo hidden-xs hidden-sm"></div>
        <div class="footer-text col-xs-12 col-sm-12">
            <span id="f_copyright" class="footer-copyright">&reg; 2014 Expedia, Inc. All rights reserved. Confidential and proprietary.</span>
        </div>
    </div>
</div>
                  </footer>
               </div>
            </div>
         </div>
      </div>
      <script>$LAB.runQueue();</script>
   </body>
</html>