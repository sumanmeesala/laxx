matrixJob('course_lineage_athena_builder_main') {
    description('This is an course_lineage_athena_builder_main Job DSL job')
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
        shell('echo "Im course_lineage_athena_builder_main"')
    }
            publishers {
              downstream('user_lo_latest_lo_version_substitution_builder_main_athena')
                   }
}
