matrixJob('employee_transition_timeline_builder_main_athena') {
    description('This is an employee_transition_timeline_builder_main_athena Job DSL job')
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
        shell('echo "Im employee_transition_timeline_builder_main_athena"')
    }
            publishers {
              downstream('employee_location_timeline_builder_main_athena')
                   }
}
