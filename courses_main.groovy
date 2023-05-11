


matrixJob('courses_main') {
    description('This is an courses_main Job DSL job')
        
   axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }
  


    steps {
        shell('echo "Im courses_main"')
    }
            publishers {
              downstream('course_subject_b_m')
                   }
}

