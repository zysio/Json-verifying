package org.example;

import junit.framework.TestCase;

public class json_verifyingTest extends TestCase {

    public void testVerifyForExistingEmptyFile() {
        System.out.println("Test Case 1");
        json_verifying verifier = new json_verifying("src/main/resources/empty.json");
        assertTrue(verifier.verify());
    }

    public void testVerifyForNonExistingFile() {
        System.out.println("Test Case 2");
        json_verifying verifier = new json_verifying("src/main/resources/thereIsNoFile");
        assertTrue(verifier.verify());
    }

    public void testVerifyForFileWithAsteriskResource() {
        System.out.println("Test Case 3");
        json_verifying verifier = new json_verifying("src/main/resources/data.json");
        assertFalse(verifier.verify());
    }

    public void testVerifyForFileWithNoAsteriskResource() {
        System.out.println("Test Case 4");
        json_verifying verifier = new json_verifying("src/main/resources/resourceWithNoAsterisk.json");
        assertTrue(verifier.verify());
    }

    public void testVerifyForFileWithNoResourceField() {
        System.out.println("Test Case 5");
        json_verifying verifier = new json_verifying("src/main/resources/noResourceField.json");
        assertTrue(verifier.verify());
    }

    public void testVerifyForFileWithMultipleResources_1() {
        System.out.println("Test Case 6");
        json_verifying verifier = new json_verifying("src/main/resources/multipleResourceFieldFalse.json");
        assertFalse(verifier.verify());
    }
    public void testVerifyForFileWithMultipleResources_2() {
        System.out.println("Test Case 7");
        json_verifying verifier = new json_verifying("src/main/resources/multipleResourceFieldTrue.json");
        assertTrue(verifier.verify());
    }
    public void testVerifyForFileWithInvalidJsonFormat() {
        System.out.println("Test Case 8");
        json_verifying verifier = new json_verifying("src/main/resources/invalidJsonFormat.json");
        assertTrue(verifier.verify());
    }

}