// 函数: _ZN14ascensionrules44CStateProcessAcquireDreambindMonsterFromVoid22BuildAcquireOptionListER13CStateMachine
// 地址: 0x125694
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r2 = zx.d(*(arg1 + 0x250))
void* r4 = *(*(arg1 + 0x24c) + 4)
int16_t r1 = -0x5fd8

if (r2 == 0)
    r1 = -0x5fdb

void* r0_1 = *(r4 + 0xa4c)

if (r2 == 0)
    r1 &= 0xffff

for (int32_t* i = *(r0_1 + 0xc); i != *(r0_1 + 0x10); i = &i[1])
    void* r2_2 = *i
    
    if (r2_2 != 0)
        void* r1_1 = *(r2_2 + 0xc)
        
        if (*(r1_1 + 0x88) == 3 && zx.d(*(r1_1 + 0xd3)) != 0)
            void* var_2c_1 = r2_2
            CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_2 + 8), zx.d(r1), "Acquire %s", 
                ascensionrules::CStateProcessAcquireDreambindMonsterFromVoid::SelectAcquireFromVoid)
            r0_1 = *(r4 + 0xa4c)

int32_t var_2c_2 = 0
CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 
    ascensionrules::CStateProcessAcquireDreambindMonsterFromVoid::SelectDone)
*(arg1 + 0x24c)
jump(*(*arg1 + 0x34))
