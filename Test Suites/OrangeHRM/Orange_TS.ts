<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Orange_TS</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>2ca6d7d3-f5c0-4b61-b40e-1a4bc6f537fa</testSuiteGuid>
   <testCaseLink>
      <guid>d8fe0658-efa1-442e-a966-7459f78d1236</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OrangeHRM-Login/TC-NavigateUrl-OrangeHRM</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>dacfbafc-4ebc-42cc-86d7-f2b48ad7cc53</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OrangeHRM-Login/TC-LoginNegative-OrangeHRM</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>2a0dbf99-34f7-48c3-aaa7-78d50b23b555</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/OrangeHRM/Login Negative TC</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>2a0dbf99-34f7-48c3-aaa7-78d50b23b555</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>17035fb2-d95c-4d3d-82e3-f50491cd271b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>2a0dbf99-34f7-48c3-aaa7-78d50b23b555</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>f9eb0357-6789-40fc-8942-34b539972da3</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
