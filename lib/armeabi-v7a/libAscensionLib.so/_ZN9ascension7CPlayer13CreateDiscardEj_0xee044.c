// 函数: _ZN9ascension7CPlayer13CreateDiscardEj
// 地址: 0xee044
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *(arg1 + 0x40)

if (r0 != 0)
    return r0

uint32_t r5 = *(arg1 + 4)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(r5)

if (r0_2 != 0)
    *(arg1 + 0x40) = r0_2
    return r0_2

core::CWorldBase* r0_3 = operator new(0x20)
uint32_t entry_r1
core::CCardStack::CCardStack(r0_3, r5, entry_r1)
*(arg1 + 0x40) = r0_3
core::CWorldBase::AddInstance(r5)
return *(arg1 + 0x40)
