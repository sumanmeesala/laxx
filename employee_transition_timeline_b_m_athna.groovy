


matrixJob('employee_transition_timeline_b_m_athna') {
    description('This is an employee_transition_timeline_b_m_athna Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im employee_transition_timeline_b_m_athna"')
    }
            publishers {
              downstream('employee_location_timeline_b_m_athna')
                   }
}

