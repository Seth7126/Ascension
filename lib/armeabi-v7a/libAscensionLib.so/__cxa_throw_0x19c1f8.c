// 函数: __cxa_throw
// 地址: 0x19c1f8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r0 = __cxa_get_globals()
*(arg1 - 0x74) = std::get_unexpected()
int32_t r0_2 = std::get_terminate()
*(arg1 - 0x80) = 1
*(arg1 - 0x70) = r0_2
*(arg1 - 0x7c) = arg2
*(arg1 - 0x78) = arg3
*(arg1 - 0x58) = 0x432b2b00
__builtin_strncpy(arg1 - 0x54, "GNLC", 4)
int32_t r1_1 = *(r0 + 4) + 1
*(r0 + 4) = r1_1
*(arg1 - 0x50) = &data_19c255
sub_1a8504(arg1 - 0x58, r1_1, &data_19c255, 1)
sub_19c26c(arg1 - 0x80)
noreturn
