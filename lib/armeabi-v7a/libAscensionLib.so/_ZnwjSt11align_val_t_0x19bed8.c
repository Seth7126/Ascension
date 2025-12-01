// 函数: _ZnwjSt11align_val_t
// 地址: 0x19bed8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r5 = arg1
int32_t r4 = arg2
int32_t r0 = *__stack_chk_guard

if (arg2 u<= 4)
    r4 = 4

if (r5 == 0)
    r5 = 1

int32_t result

while (sub_1a761c(&result, r4, r5) != 0)
    int32_t r0_1 = std::get_new_handler()
    
    if (r0_1 == 0)
        __cxa_allocate_exception(4)
        __cxa_throw(std::bad_alloc::bad_alloc(), _typeinfo_for_std::bad_alloc, 
            std::bad_alloc::~bad_alloc)
        noreturn
    
    r0_1()

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
