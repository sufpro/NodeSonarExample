libraries {
 nodejs {
 merge=true
 xx='yy'
}
 sonarqube {
  merge =true
cli_parameters = [
           "-Dsonar.projectKey='projNodeJs'",
           "-Dsonar.sources= 'src'",
           "-Dsonar.tests='src'",
           "-Dsonar.inclusions='**'",
           "-Dsonar.test.inclusions='src/**/*.spec.js,src/**/*.spec.jsx,src/**/*.test.js,src/**/*.test.jsx''",
           "-Dsonar.javascript.lcov.reportPaths='coverage/lcov.info'",
           "-Dsonar.testExecutionReportPaths='coverage/test-reporter.xml'"
        ] 
}
} 
