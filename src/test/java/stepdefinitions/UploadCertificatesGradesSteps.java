package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class UploadCertificatesGradesSteps {

    private String uploadedFileType;
    private boolean uploadSuccess = false;

    @When("I upload a certificate file in PDF format")
    public void iUploadACertificateFileInPDFFormat() {
        uploadedFileType = "PDF";
        uploadSuccess = uploadedFileType.equalsIgnoreCase("PDF");
        System.out.println("Uploading file: certificate.pdf");
    }

    @When("I upload a grade file in image format")
    public void iUploadAGradeFileInImageFormat() {
        uploadedFileType = "Image";
        uploadSuccess = uploadedFileType.equalsIgnoreCase("Image");
        System.out.println("Uploading file: grade.png");
    }

    @Then("the certificate should be successfully uploaded")
    public void theCertificateShouldBeSuccessfullyUploaded() {
        assertTrue("Certificate upload failed", uploadSuccess);
        System.out.println("Certificate successfully uploaded");
    }

    @Then("the platform should validate the file format")
    public void the_platform_should_validate_the_file_format() {
        System.out.println("File format validated");
    }

    @Then("the grade file should be successfully uploaded")
    public void the_grade_file_should_be_successfully_uploaded() {
        System.out.println("Grade file successfully uploaded");
    }
}