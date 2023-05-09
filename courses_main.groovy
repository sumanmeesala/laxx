job('courses_main') {
    description('This is an courses_main Job DSL job')
        
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
        shell('echo "Im courses_main"')
    }
            publishers {
              downstream('course_subject_builder_main')
                   }
}
