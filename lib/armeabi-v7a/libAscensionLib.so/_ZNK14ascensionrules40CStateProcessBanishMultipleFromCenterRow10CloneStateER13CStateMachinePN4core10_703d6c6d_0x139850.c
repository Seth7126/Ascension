// 函数: _ZNK14ascensionrules40CStateProcessBanishMultipleFromCenterRow10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x139850
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*(*(arg1 + 0x24c) + 8)
int32_t r0_2 = core::CWorldBase::GetInstanceByID(arg3)
uint32_t result = *arg4
int32_t* arg_0

if (result == 0 || *arg_0 u< 0x61c)
    ascension::CPlayer* result_1 = operator new(0x61c)
    result = result_1
    ascensionrules::CStateProcessBanishMultipleFromCenterRow::CStateProcessBanishMultipleFromCenterRow(
        result_1, r0_2, *(arg1 + 0x250))
else
    ascensionrules::CStateProcessBanishMultipleFromCenterRow::CStateProcessBanishMultipleFromCenterRow(
        result, r0_2, *(arg1 + 0x250))
    *(result + 0x2c) = 0
    *arg4 += 0x61c
    *arg_0 -= 0x61c

*(result + 0x28) = arg1
int32_t r5 = 0x97
int32_t r8_2 = 0x280
int32_t i = 0
*(result + 0x258) = *(arg1 + 0x258)

do
    void* r0_10 = *(arg1 + 0x25c + (i << 2))
    int32_t r0_12
    
    if (r0_10 == 0)
        r0_12 = 0
    else
        *(r0_10 + 8)
        r0_12 = core::CWorldBase::GetInstanceByID(arg3)
    
    *(result + (r5 << 2)) = r0_12
    *(result + i + 0x278) = *(arg1 + i + 0x278)
    int32_t* r0_16 = result + r8_2
    (*(*r0_16 + 8))(r0_16, arg1 + r8_2, arg3)
    i += 1
    r8_2 += 0x84
    r5 += 1
while (i != 7)

if (*(arg1 + 0x38) s> 0)
    ascensionrules::CStateProcessBanishMultipleFromCenterRow::BuildBanishOptions(result)

return result
