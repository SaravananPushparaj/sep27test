package uj;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addlesson {
@SuppressWarnings("resource")
public static void main(String[] args) throws Exception {
	
	FirefoxDriver fd = new FirefoxDriver();
	fd.get("https://skill-bytes.com/wp-admin/users.php");
	fd.manage().window().maximize();
	fd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	ExcelRW ex = new ExcelRW("E:\\Skill-bytes\\Upload_files\\MOBILE APP_FINAL COURSE_IFRAME.xlsx");
	int rowcount = ex.getRowcount("Sheet5");
	Scanner scanner = new Scanner(System.in);
	
	for(int j=247;j<=rowcount;j++){
		System.out.println("start");
		String next = scanner.next();
		if(next.equalsIgnoreCase("a")){
			fd.findElement(By.id("title")).sendKeys(ex.readcell("Sheet5", j, 1));
			fd.findElement(By.id("_lp_duration")).clear();
			if(!ex.readcell("Sheet5", j, 3).replace(".0", "").trim().equalsIgnoreCase("0")){
			fd.findElement(By.id("post-format-video")).click();
			}
			fd.findElement(By.id("_lp_duration")).sendKeys(ex.readcell("Sheet5", j, 3).replace(".0", "").trim());
			fd.findElement(By.id("comment_status")).click();

			fd.findElement(By.cssSelector("html.wp-toolbar body.wp-admin.wp-core-ui.js.abtf-criticalcss.post-new-php.auto-fold.admin-bar.post-type-lp_lesson.branch-4-7.version-4-7-4.admin-color-fresh.locale-en-us.no-customize-support.svg div#wpwrap div#wpcontent div#wpbody div#wpbody-content div.wrap form#post div#poststuff div#post-body.metabox-holder.columns-2 div#postbox-container-1.postbox-container div#side-sortables.meta-box-sortables.ui-sortable div#submitdiv.postbox div.inside div#submitpost.submitbox div#major-publishing-actions div#publishing-action input#publish.button.button-primary.button-large")).submit();		
			
		}
		
		
				
	}
	
	
	
	
}
}
