matrixJob('course_time_line_builder_athena_main') {
    description('This is an course_time_line_builder_athena_main Job DSL job')
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
        shell('echo "Im course_time_line_builder_athena_main"')
    }
            publishers {
              downstream('employee_life_time_learning_time_line_builder_athena_main')
                   }
}
