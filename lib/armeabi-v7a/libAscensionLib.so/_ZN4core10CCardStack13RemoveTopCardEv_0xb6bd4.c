// 函数: _ZN4core10CCardStack13RemoveTopCardEv
// 地址: 0xb6bd4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* entry_r0
int32_t r0 = *(entry_r0 + 0x10)

if (*(entry_r0 + 0xc) == r0)
    return 0

void* result = *(r0 - 4)
void* r0_2 = core::CWorldBase::AddRollbackData(*(entry_r0 + 4), zx.d(*(entry_r0 + 8)), 0x113)
int32_t r1_3

if (r0_2 == 0)
    r1_3 = *(entry_r0 + 0x18)
else
    uint32_t r1_2
    
    if (result != 0)
        r1_2 = zx.d(*(result + 8))
    else
        r1_2 = 0
    
    *(r0_2 + 0xc) = r1_2
    r1_3 = *(entry_r0 + 0x18)
    *(r0_2 + 0x12) = r1_3.w
    *(r0_2 + 0x10) = r1_3.w - 1

int32_t r0_4 = *(entry_r0 + 0x10)
*(entry_r0 + 0x18) = r1_3 - 1
*(entry_r0 + 0x10) = r0_4 - 4
return result
