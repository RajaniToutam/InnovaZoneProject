/*
NocCommerece website
****id and pwd****
raj_nishi1@outlook.com/rajnishi2019

    //For scrolling window
     ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

   //Wait
   Thread.sleep(2000)

   ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");


     _________________________________________________________

     //if (statusBtn.isDisplayed()) {
     //                statusBtn.click();
     //                Thread.sleep(2000);
     //                WebDriverWait wait = new WebDriverWait(driver, 90);
     //                wait.until(ExpectedConditions.alertIsPresent());
     //                Alert okAlert = driver.switchTo().alert();
     //                okAlert.accept();
     //                return true;
     //
     //            } else {
     //                System.out.println("btn  is not clickable..!!");
     //                return false;
     //            }

}

  //Upload Image
    public boolean imageUpLoad() {
        try {
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

            WebElement imageUpLoad = (new WebDriverWait(driver, 30))
                    .until(ExpectedConditions.presenceOfElementLocated(image_xpath));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", imageUpLoad);
            imageUpLoad.sendKeys("C:\\Sketch 1.png");
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }

        For dropdown selection

        public boolean enterDept(String DeptNumber) {
        try {

            WebElement enterDept = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(Jobzone_xPath));
            enterDept.click();
            List<WebElement> DeptList = driver.findElements(By.xpath("//select[@id='department_id']//option"));
            System.out.println("Total Checkbox " + DeptList.size());
            for (WebElement element : DeptList) {
                Actions action = new Actions(driver);//used for mouse clicking or mouse hover or scrolling the list
                action.moveToElement(element);

                String deptnames = element.getText();
                if (deptnames.contains(DeptNumber)) {
                    element.click();
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
*/
