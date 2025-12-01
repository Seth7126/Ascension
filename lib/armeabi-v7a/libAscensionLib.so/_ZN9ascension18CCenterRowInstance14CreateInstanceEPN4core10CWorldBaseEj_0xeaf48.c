// 函数: _ZN9ascension18CCenterRowInstance14CreateInstanceEPN4core10CWorldBaseEj
// 地址: 0xeaf48
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CWorldBase* result = operator new(0x24)
core::CInstance::CInstance(result, arg1)
__builtin_memset(result + 0xc, 0, 0x18)
*result = _vtable_for_ascension::CCenterRowInstance + 8
*(arg1 + 4) += 1
int32_t r0_3 = operator new(0x20)
*(result + 0xc) = r0_3
*(result + 0x10) = r0_3
*(result + 0x14) = r0_3 + 0x20
return result
