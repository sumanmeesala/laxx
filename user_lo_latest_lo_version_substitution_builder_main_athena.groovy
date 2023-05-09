matrixJob('user_lo_latest_lo_version_substitution_builder_main_athena') {
    description('This is an user_lo_latest_lo_version_substitution_builder_main_athena Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }
    scm {
        git('https://github.com/sumanmeesala/laxx.git')
    }

    steps {
        shell('echo "Im user_lo_latest_lo_version_substitution_builder_main_athena"')
    }
            publishers {
              downstream('courses_main')
                   }
}
