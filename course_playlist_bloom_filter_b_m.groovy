package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()



matrixJob('course_playlist_bloom_filter_b_m') {
    description('This is an course_playlist_bloom_filter_b_m Job DSL job')
      axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }


    steps {
        shell('echo "Im course_playlist_bloom_filter_b_m"')
    }
            publishers {
              downstream('ou_substitution_b_m_athna')
                   }
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('course_playlist_bloom_filter_b_m') 
jenkins.save()

}

