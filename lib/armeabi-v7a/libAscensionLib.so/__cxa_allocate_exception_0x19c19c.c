// 函数: __cxa_allocate_exception
// 地址: 0x19c19c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r4 = (arg1 + 0x87) & 0xfffffff8
void* r0_2 = sub_19d0b8(r4)

if (r0_2 == 0)
    std::terminate()
    noreturn

__aeabi_memclr8(r0_2, r4)
return r0_2 + 0x80
