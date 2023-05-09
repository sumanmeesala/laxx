matrixJob('playlist_recommendations_nc_builder_main') {
    description('This is an playlist_recommendations_nc_builder_main Job DSL job')
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
        shell('echo "Im playlist_recommendations_nc_builder_main"')
    }
            publishers {
              downstream('course_playlist_bloom_filter_builder_main')
                   }
}
