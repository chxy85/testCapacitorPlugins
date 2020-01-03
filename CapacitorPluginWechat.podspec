
  Pod::Spec.new do |s|
    s.name = 'CapacitorPluginWechat'
    s.version = '0.0.2'
    s.summary = 'wechat'
    s.license = 'MIT'
    s.homepage = 'wevhat'
    s.author = 'cx'
    s.source = { :git => 'wevhat', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end