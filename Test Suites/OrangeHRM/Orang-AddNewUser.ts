<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Orang-AddNewUser</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>3100a68c-6278-49f9-b3b6-3ac2980c128d</testSuiteGuid>
   <testCaseLink>
      <guid>82e68457-2b9c-4f05-bf9c-dbdc1f85a533</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OrangeHRM-Login/TC-NavigateUrl-OrangeHRM</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>79762d1e-fea7-428e-8817-01cb3f8330c9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/OrangeHRM-Login/TC-Login-OrangeHRM</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>65547761-d01e-4ba6-80af-3e61c71b2984</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/OrangeHRM-Login/TC-Login-NewUser</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b4a9bb93-3eb9-4fc5-b945-a18e55f5970b</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/OrangeHRM/Login Negative TC</testDataId>
      </testDataLink>
   </testCaseLink>
   <testCaseLink>
      <guid>8ced2206-aefc-41fe-b0c5-545741dd3373</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/OrangeHRM-Login/TC-LoginNegative-OrangeHRM</testCaseId>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>17035fb2-d95c-4d3d-82e3-f50491cd271b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>f9eb0357-6789-40fc-8942-34b539972da3</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>8b29728f-acdb-4fde-ba1a-7d79fb11f49c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/OrangeHRM-Login/TC-SwitchCase_Statement</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c53cde65-fdfe-4d02-b1a7-a046fb9d29c1</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/OrangeHRM/Login Negative TC</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>c53cde65-fdfe-4d02-b1a7-a046fb9d29c1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Username</value>
         <variableId>29da7104-ae03-4469-a440-36bda6064473</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c53cde65-fdfe-4d02-b1a7-a046fb9d29c1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>f75fbafe-0225-4d40-a4c1-759e20a9b329</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
