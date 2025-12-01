// 函数: _ZN9ascension19CPortalCardInstance12CopyInstanceEPKN4core9CInstanceEPNS1_10CWorldBaseE
// 地址: 0xe4354
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

core::CCardInstance::CopyInstance(arg1, arg2)
void* r0 = *(arg2 + 0x10)
int32_t r0_2

if (r0 == 0)
    r0_2 = 0
else
    *(r0 + 8)
    uint32_t entry_r2
    r0_2 = core::CWorldBase::GetInstanceByID(entry_r2)

*(arg1 + 0x10) = r0_2
int32_t result = *(arg2 + 0x14)
*(arg1 + 0x14) = result
return result
