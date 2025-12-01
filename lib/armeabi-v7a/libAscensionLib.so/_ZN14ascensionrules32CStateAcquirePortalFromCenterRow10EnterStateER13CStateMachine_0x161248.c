// 函数: _ZN14ascensionrules32CStateAcquirePortalFromCenterRow10EnterStateER13CStateMachine
// 地址: 0x161248
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r6 = *(*(arg1 + 0x24c) + 4)
void* r0_2 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_2 != 0 && *(*(r0_2 + 0xc) + 0x88) == 8)
    void* var_1c_1 = r0_2
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_2 + 8), 0xa02d, "Acquire %s", 
        ascensionrules::CStateAcquirePortalFromCenterRow::SelectAcquireFromCenterRow)

void* r0_5 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_5 != 0 && *(*(r0_5 + 0xc) + 0x88) == 8)
    void* var_1c_2 = r0_5
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_5 + 8), 0xa02d, "Acquire %s", 
        ascensionrules::CStateAcquirePortalFromCenterRow::SelectAcquireFromCenterRow)

void* r0_8 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_8 != 0 && *(*(r0_8 + 0xc) + 0x88) == 8)
    void* var_1c_3 = r0_8
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_8 + 8), 0xa02d, "Acquire %s", 
        ascensionrules::CStateAcquirePortalFromCenterRow::SelectAcquireFromCenterRow)

void* r0_11 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_11 != 0 && *(*(r0_11 + 0xc) + 0x88) == 8)
    void* var_1c_4 = r0_11
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_11 + 8), 0xa02d, "Acquire %s", 
        ascensionrules::CStateAcquirePortalFromCenterRow::SelectAcquireFromCenterRow)

void* r0_14 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_14 != 0 && *(*(r0_14 + 0xc) + 0x88) == 8)
    void* var_1c_5 = r0_14
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_14 + 8), 0xa02d, "Acquire %s", 
        ascensionrules::CStateAcquirePortalFromCenterRow::SelectAcquireFromCenterRow)

void* r0_17 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_17 != 0 && *(*(r0_17 + 0xc) + 0x88) == 8)
    void* var_1c_6 = r0_17
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_17 + 8), 0xa02d, "Acquire %s", 
        ascensionrules::CStateAcquirePortalFromCenterRow::SelectAcquireFromCenterRow)

void* r0_20 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_20 != 0 && *(*(r0_20 + 0xc) + 0x88) == 8)
    void* var_1c_7 = r0_20
    CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_20 + 8), 0xa02d, "Acquire %s", 
        ascensionrules::CStateAcquirePortalFromCenterRow::SelectAcquireFromCenterRow)

void* r0_24

if (*(arg1 + 0x250) != 0)
    int32_t var_1c_8 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa000, "None", 0)
    r0_24 = *arg1
else if (*(arg1 + 0x254) != 3)
    r0_24 = *arg1
else
    int32_t var_1c_9 = 0
    CGameStateOptions::AddSimpleUserOption(arg1.w, 0, 0xa080, "Gain 3 Honor", 
        ascensionrules::CStateAcquirePortalFromCenterRow::SelectGainHonor)
    r0_24 = *arg1

*(arg1 + 0x24c)
jump(*(r0_24 + 0x34))
