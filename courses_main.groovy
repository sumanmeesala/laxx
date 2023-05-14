package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()



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
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('courses_main') 
jenkins.save()

}

