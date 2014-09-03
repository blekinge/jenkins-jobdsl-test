job {
    name 'SButil'
    description 'This is the sbutil helpful java library'
    concurrentBuild 'true'
    scm {
        git('git@github.com:statsbiblioteket/sbutil.git')
    }
    triggers {
        githubPush()
        scm('*/15 * * * *')
    }
    jdk 'java7'
    steps {
        maven('-e clean test')
    }
}


