libraries {
 nodejs
 sonarqube {
  merge =true
  projectKey='projNodeJs'
  sources='src'
  tests='src' 
  inclusions='**'
  testInclusions='src/**/*.spec.js,src/**/*.spec.jsx,src/**/*.test.js,src/**/*.test.jsx'
  lcov='coverage/lcov.info'
  testExecutionReportPaths='coverage/test-reporter.xml'
 }
} 
