// 函数: _Znwj
// 地址: 0x19be44
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r4 = arg1

if (arg1 == 0)
    r4 = 1

while (true)
    void* result = malloc(r4)
    
    if (result != 0)
        return result
    
    int32_t r0 = std::get_new_handler()
    
    if (r0 == 0)
        break
    
    r0()

__cxa_allocate_exception(4)
__cxa_throw(std::bad_alloc::bad_alloc(), _typeinfo_for_std::bad_alloc, std::bad_alloc::~bad_alloc)
noreturn
