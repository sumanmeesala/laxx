matrixJob('subject_recommendations_builder_main') {
    description('This is an subject_recommendations_builder_main Job DSL job')
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
        shell('echo "Im subject_recommendations_builder_main"')
    }
            publishers {
              downstream('subject_recommendations_nc_builder_main')
                   }
}
