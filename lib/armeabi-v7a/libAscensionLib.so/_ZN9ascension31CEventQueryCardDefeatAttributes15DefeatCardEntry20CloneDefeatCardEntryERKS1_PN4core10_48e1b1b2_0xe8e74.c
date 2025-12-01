// 函数: _ZN9ascension31CEventQueryCardDefeatAttributes15DefeatCardEntry20CloneDefeatCardEntryERKS1_PN4core10CWorldBaseE
// 地址: 0xe8e74
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*arg2 + 8)
uint32_t entry_r2
*arg1 = core::CWorldBase::GetInstanceByID(entry_r2)
*(arg1 + 4) = *(arg2 + 4)
*(arg1 + 8) = *(arg2 + 8)
*(arg1 + 0xc) = *(arg2 + 0xc)
*(arg1 + 0x10) = *(arg2 + 0x10)
*(arg1 + 0x14) = *(arg2 + 0x14)
*(arg1 + 0x18) = *(arg2 + 0x18)
__aeabi_memcpy4(arg1 + 0x1c, arg2 + 0x1c, *(arg2 + 0x18))
return __aeabi_memcpy4(arg1 + 0x24, arg2 + 0x24, *(arg2 + 0x18) << 1)
