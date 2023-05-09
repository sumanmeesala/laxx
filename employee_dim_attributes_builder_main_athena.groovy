matrixJob('employee_dim_attributes_builder_main_athena') {
    description('This is an employee_dim_attributes_builder_main_athena Job DSL job')
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
        shell('echo "Im employee_dim_attributes_builder_main_athena"')
    }
            publishers {
              downstream('course_time_line_builder_athena_main')
                   }
}
