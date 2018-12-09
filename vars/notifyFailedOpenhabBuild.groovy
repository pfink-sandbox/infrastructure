def call() {
    slackSend color: 'danger', message: "${env.JOB_NAME} - #${env.BUILD_NUMBER} Failure after ${currentBuild.durationString.replace(' and counting', '')} (<${env.BUILD_URL}|Open>). Eventually, a recent code change broke the release automation mechanisms. Please check and hold back unrelated merges that contain changes on POMs and MANIFESTs until <${env.JOB_URL}|${env.JOB_NAME}> is back to normal."
}