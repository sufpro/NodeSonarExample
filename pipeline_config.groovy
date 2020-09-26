liabraries {
 nodejs
 sonarqube {
  projectKey=test-node-js
  sources='src'
  tests='src' 
  inclusions='**'
  testInclusions='src/**/*.spec.js,src/**/*.spec.jsx,src/**/*.test.js,src/**/*.test.jsx'
  lcov='coverage/lcov.info'
  testExecutionReportPaths='coverage/test-reporter.xml'
 }
}
