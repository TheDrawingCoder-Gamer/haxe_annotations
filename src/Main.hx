package;

@:meta(java_test.ParentAnn(value = java_test.ChildAnn(value = "hi")))
class Main {
    public static function main() {
	trace("hi");
    }
}
