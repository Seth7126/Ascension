// 函数: _ZN14ascensionrules41CStateProcessAcquireMysticOrHeavyInfantry10EnterStateER13CStateMachine
// 地址: 0x120a10
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r6 = *(*(arg1 + 0x24c) + 4)
int16_t r0_1

if (*(arg1 + 0x25c) == 0)
    r0_1 = -0x5fe0
    
    if (*(arg1 + 0x260) != 0)
        r0_1 = -0x5fde
else
    r0_1 = -0x5fdc

int32_t* i = *(r6 + 0xa30)

for (int32_t r9 = *(r6 + 0xa34); i != r9; i = &i[1])
    void* r10_1 = *i
    
    if (*(r10_1 + 0x10) != 0)
        void* r7_1 = *(r10_1 + 0xc)
        int32_t r0_5
        
        if (*(arg1 + 0x254) != 0)
            r0_5 = strcasecmp(r7_1 + 0x44, "Mystic")
        
        if (*(arg1 + 0x254) != 0 && r0_5 == 0)
        label_120ad8:
            void* var_2c_1 = r10_1
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r10_1 + 8), zx.d(r0_1), "Acquire %s", 
                ascensionrules::CStateProcessAcquireMysticOrHeavyInfantry::SelectAcquire)
            r9 = *(r6 + 0xa34)
        else if (*(arg1 + 0x258) != 0 && strcasecmp(r7_1 + 0x44, "Heavy Infantry") == 0)
            goto label_120ad8

int32_t r12

if (*(arg1 + 0x250) != 0)
    int32_t var_2c_2 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    
    if (*(arg1 + 0x25c) == 0)
        *(arg1 + 0x24c)
        *(arg1 + 0x258)
        r12 = *(*arg1 + 0x34)
        *(arg1 + 0x260)
    else
        *(arg1 + 0x24c)
        r12 = *(*arg1 + 0x34)
        *(arg1 + 0x258)
else if (*(arg1 + 0x25c) == 0)
    *(arg1 + 0x24c)
    *(arg1 + 0x258)
    r12 = *(*arg1 + 0x34)
    *(arg1 + 0x260)
else
    *(arg1 + 0x24c)
    r12 = *(*arg1 + 0x34)
    *(arg1 + 0x258)

jump(r12)
