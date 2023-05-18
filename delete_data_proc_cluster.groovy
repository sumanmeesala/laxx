
package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()


matrixJob('delete_data_proc_cluster') {
    description('This is an delete_data_proc_cluster Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im delete_data_proc_cluster"')
    }
          
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('delete_data_proc_cluster') 
jenkins.save()

}
