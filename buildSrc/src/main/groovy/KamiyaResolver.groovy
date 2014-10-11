class KamiyaResolver implements Resolver {

    @Override
    File getJplDir(File baseDir, int ch, int ex) {
        return new File(baseDir, String.format("ch%02d/src/ex%<02d_%02d", ch, ex))
    }

    @Override
    File getGuiDir(File baseDir, int ch, int ex) {
        return new File(baseDir, "GUI/src/GUI${ch}_${ex}")
    }

    @Override
    File getInterpretDir(File baseDir) {
        return new File(baseDir, 'interpret/src')
    }
}