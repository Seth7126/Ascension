// 函数: _ZNK14ascensionrules41CStateProcessDefeatAllMonstersInCenterRow10CloneStateER13CStateMachinePN4core10CWorldBaseERPcRj
// 地址: 0x15f950
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

char*& r7 = arg3
*(*(arg1 + 0x24c) + 8)
core::CWorldBase::GetInstanceByID(arg3)
uint32_t r0_3 = *arg4
core::CWorldBase* var_34 = arg2
int32_t* arg_0
CStateMachine* r1_3

if (r0_3 == 0 || *arg_0 u< 0x870)
    CStateMachine* r0_9 = operator new(0x870)
    ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::CStateProcessDefeatAllMonstersInCenterRow(
        r0_9)
    r1_3 = r0_9
else
    r1_3 = ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::CStateProcessDefeatAllMonstersInCenterRow(
        r0_3)
    *(r1_3 + 0x2c) = 0
    *arg4 += 0x870
    *arg_0 -= 0x870

*(r1_3 + 0x28) = arg1
int32_t r4_2 = 0x4d4
*(r1_3 + 0x494) = *(arg1 + 0x494)
int32_t r10 = 0
int32_t i = 0
*(r1_3 + 0x490) = *(arg1 + 0x490)
int32_t r5_1 = 0x126

do
    void* r0_14 = *(arg1 + 0x498 + (i << 2))
    int32_t r0_16
    CStateMachine* r2
    char*& r9_1
    
    if (r0_14 == 0)
        r2 = r1_3
        r0_16 = 0
        r9_1 = r7
    else
        *(r0_14 + 8)
        r9_1 = r7
        r0_16 = core::CWorldBase::GetInstanceByID(r7)
        r2 = r1_3
    
    *(r2 + (r5_1 << 2)) = r0_16
    r7 = r9_1
    *(r2 + i + 0x4b4) = *(arg1 + 0x4d4 + i - 0x20)
    (*(*(r2 + r10 + 0x4d4) + 8))(r2 + r4_2, arg1 + 0x4d4 + r10, r9_1)
    i += 1
    r4_2 += 0x84
    r10 += 0x84
    r5_1 += 1
while (i != 7)

CStateMachine* r2_2 = r1_3
*(r2_2 + 0x4bc) = *(arg1 + 0x4bc)

if (*(arg1 + 0x4bc) s>= 1)
    void* __offset(CStateMachine, 0x4d0) r4_3 = r2_2 + 0x4d0
    int32_t i_1 = 0
    
    do
        void* r0_24 = *(arg1 + 0x4d0 + (i_1 << 2) - 0x10)
        
        if (r0_24 == 0)
            *(r4_3 + (i_1 << 2) - 0x10) = 0
        else
            *(r0_24 + 8)
            r2_2 = r1_3
            *(r4_3 + (i_1 << 2) - 0x10) = core::CWorldBase::GetInstanceByID(r7)
        
        *(r4_3 + i_1) = *(arg1 + 0x4d0 + i_1)
        i_1 += 1
    while (i_1 s< *(arg1 + 0x4bc))

if (*(arg1 + 0x38) s<= 0)
    return r2_2

ascensionrules::CStateProcessDefeatAllMonstersInCenterRow::BuildDefeatOptions(r2_2)
return r1_3
